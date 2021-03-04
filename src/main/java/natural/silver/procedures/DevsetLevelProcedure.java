package natural.silver.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;
import java.util.HashMap;

@NaturalmoonModElements.ModElement.Tag
public class DevsetLevelProcedure extends NaturalmoonModElements.ModElement {
	public DevsetLevelProcedure(NaturalmoonModElements instance) {
		super(instance, 104);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure DevsetLevel!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				System.err.println("Failed to load dependency guistate for procedure DevsetLevel!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		{
			double _setval = (double) new Object() {
				int convert(String s) {
					try {
						return Integer.parseInt(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((new Object() {
				public String getText() {
					TextFieldWidget textField = (TextFieldWidget) guistate.get("text:level");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText()));
			entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Level = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
