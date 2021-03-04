package natural.silver.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.client.gui.widget.TextFieldWidget;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;
import java.util.HashMap;

@NaturalmoonModElements.ModElement.Tag
public class DevSetMaxLevelProcedure extends NaturalmoonModElements.ModElement {
	public DevSetMaxLevelProcedure(NaturalmoonModElements instance) {
		super(instance, 105);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				System.err.println("Failed to load dependency guistate for procedure DevSetMaxLevel!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure DevSetMaxLevel!");
			return;
		}
		HashMap guistate = (HashMap) dependencies.get("guistate");
		IWorld world = (IWorld) dependencies.get("world");
		NaturalmoonModVariables.MapVariables.get(world).max_level = (double) new Object() {
			int convert(String s) {
				try {
					return Integer.parseInt(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert((new Object() {
			public String getText() {
				TextFieldWidget textField = (TextFieldWidget) guistate.get("text:max_level");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText()));
		NaturalmoonModVariables.MapVariables.get(world).syncData(world);
	}
}
