package natural.silver.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class MenuKeyProcedure extends NaturalmoonModElements.ModElement {
	public MenuKeyProcedure(NaturalmoonModElements instance) {
		super(instance, 56);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MenuKey!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure MenuKey!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure MenuKey!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure MenuKey!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure MenuKey!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Werewolf)))) {
			if ((!(world.getWorld().isDaytime()))) {
				if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).transformed_werewolf) == (false))) {
					if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 1)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_omega ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 2)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_omega_2 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 3)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_omega_3 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 4)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_omega_4 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 5)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_omega_5 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 6)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayerneutral_1 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 7)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayerneutral_2 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 8)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayerneutral_3 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 9)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayerneutral_4 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 10)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_beta ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 11)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_beta_2 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 12)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_beta_3 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 13)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_beta_4 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 14)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_beta_4 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 15)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_alpha ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 16)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_alpha_2 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 17)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_alpha_3 ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 18)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_alpha ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 19)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_alpha ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 20)) {
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"summon naturalmoon:werewolfplayer_alpha ~ ~ ~ {NoAI:1b}");
						}
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "Yes";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).transformed_werewolf) == (true))) {
					if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 1)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_omega]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 2)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_omega_2]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 3)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_omega_3]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 4)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_omega_4]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 5)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_omega_5]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 6)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayerneutral_1]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 7)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayerneutral_2]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 8)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayerneutral_3]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 9)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 140, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 240, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayerneutral_4]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 10)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 220, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beta]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 11)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 220, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beta_2]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 12)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 220, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beta_3]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 13)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 220, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beta_4]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 14)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 120, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 220, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beta_5]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 15)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 180, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_alpha");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 16)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 180, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_alpha_2]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 17)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 180, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_alpha_3]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 18)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 180, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_alpha_4]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 19)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 180, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_alpha_5]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 20)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 180, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_alpha_6]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 21)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 140, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beast]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 22)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 140, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beast]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 23)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 140, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beast]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 24)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 140, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beast]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 25)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 80, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 140, (int) 1, (false), (false)));
						if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
							world.getWorld().getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"kill @e[type=werewolfplayer_beast]");
						}
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.transformed_werewolf = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (String) "No";
							entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Natural_player = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			} else if ((world.getWorld().isDaytime())) {
				if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 1)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 2)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 3)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 4)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 5)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 6)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 7)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 8)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 9)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 10)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 11)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 12)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 13)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 14)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 15)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) == 16)) {
					if ((Math.random() < 0.4)) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> ggrrrr."), (false));
						}
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) < 17)) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> leave me alone"), (false));
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) < 18)) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR"), (false));
					}
				} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) < 19)) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("<beast> GGRRRR"), (false));
					}
				}
			}
		} else if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Immune)))) {
			if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NaturalmoonModVariables.PlayerVariables())).Hunters_Rage) == (false))) {
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Hunters_Rage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NaturalmoonModVariables.PlayerVariables())).Hunters_Rage) == (true))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 100, (int) 1, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 40, (int) 1, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 80, (int) 1, (false), (false)));
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Hunters_Rage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
