package iotsuite.mappingalgo;

import iotsuite.semanticmodel.DeploymentScope;
import iotsuite.semanticmodel.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MappingAlgoCompiler {

	private static int j;
	private static int deviceWithNullAbilityCount;

	public static Map<String, Set<String>> mappingOutputForLinker = new HashMap<String, Set<String>>();
	public static Map<String, String> mappingOutputBuiltInSoftwareComponentForLinker = new HashMap<String, String>();

	public static Map<Device, Set<String>> mapTasks(List<Device> deviceList,
			List<DeploymentScope> mappingConstraintList) {

		List<Device> tempDeviceList = new ArrayList<Device>();
		List<String> tempSoftwareComponentList = new ArrayList<String>();
		List<Device> deviceWithNullAbility = new ArrayList<Device>();
		final Map<Device, Set<String>> finalMapping = new HashMap<Device, Set<String>>();

		for (Device deviceObj : deviceList) {
			tempDeviceList.add(deviceObj);
			if (deviceObj.getAbilities().isEmpty()) {
				deviceWithNullAbility.add(deviceObj);
			}
			// System.out.println("temp Device LIst is..."+deviceWithNullAbility);
		}
		for (DeploymentScope mc : mappingConstraintList) {
			tempSoftwareComponentList.add(mc.getSoftwareComponentName());
			// System.out.println("Soft Component List...."+tempSoftwareComponentList);
			mappingOutputBuiltInSoftwareComponentForLinker.put(
					mc.getSoftwareComponentName(),
					mc.getSoftwareComponentType());
		}

		for (int i = 0; i < tempDeviceList.size(); i++) {

			if (tempDeviceList.get(i).getAbilities().isEmpty()) {
				// This is for devices with NULL abilities

				// For Software Component - Custom

				if (deviceWithNullAbilityCount == (deviceWithNullAbility.size() - 1)) {

					Set<String> tempsc = new HashSet<String>();
					for (int k = (deviceWithNullAbility.size() - 1); k <= (tempSoftwareComponentList
							.size() - 1); k++) {
						tempsc.add(tempSoftwareComponentList.get(k));
						tempsc.add("false");
						String softwareComponentType = mappingOutputBuiltInSoftwareComponentForLinker
								.get(tempSoftwareComponentList.get(k));
						tempsc.add(softwareComponentType);
					}
					mappingOutputForLinker.put(tempDeviceList.get(i).getName(),
							tempsc);

					// False abilities have been removed ....
					Set<String> tempscForFinalOutputVaribale = new HashSet<String>();
					for (int k = (deviceWithNullAbility.size() - 1); k <= (tempSoftwareComponentList
							.size() - 1); k++) {
						tempscForFinalOutputVaribale
								.add(tempSoftwareComponentList.get(k));

					}
					finalMapping.put(tempDeviceList.get(i),
							tempscForFinalOutputVaribale);
					// j++;

				}

				else {
					Set<String> tempsc = new HashSet<String>();
					tempsc.add(tempSoftwareComponentList.get(j));
					tempsc.add("false");
					String softwareComponentType = mappingOutputBuiltInSoftwareComponentForLinker
							.get(tempSoftwareComponentList.get(j));
					tempsc.add(softwareComponentType);

					mappingOutputForLinker.put(tempDeviceList.get(i).getName(),
							tempsc);

					// False abilities have been removed ....
					Set<String> tempscForFinalOutputVaribale = new HashSet<String>();
					tempscForFinalOutputVaribale.add(tempSoftwareComponentList
							.get(j));
					finalMapping.put(tempDeviceList.get(i),
							tempscForFinalOutputVaribale);
					j++;
					deviceWithNullAbilityCount++;

				}
			} else {
				finalMapping.put(tempDeviceList.get(i), tempDeviceList.get(i)
						.getAbilities());
				Set<String> tempSoftwareComponentWithAbilities = new HashSet<String>();
				tempSoftwareComponentWithAbilities.addAll(tempDeviceList.get(i)
						.getAbilities());
				tempSoftwareComponentWithAbilities.add("true");
				tempSoftwareComponentWithAbilities.add("NoType");
				mappingOutputForLinker.put(tempDeviceList.get(i).getName(),
						tempSoftwareComponentWithAbilities);
			}
		}
		return finalMapping;
	}
}
