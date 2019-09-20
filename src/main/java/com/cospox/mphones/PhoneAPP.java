package com.cospox.mphones;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.GuiButton;

import java.util.HashMap;

public class PhoneAPP extends MPhones.ModElement {

	public static int GUIID = 2;
	public static HashMap guiinventory = new HashMap();

	public PhoneAPP(MPhones instance) {
		super(instance);
	}

	public static class GuiContainerMod extends Container {

		World world;
		EntityPlayer entity;
		int x, y, z;

		public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
			this.world = world;
			this.entity = player;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public boolean canInteractWith(EntityPlayer player) {
			return true;
		}

		public void onContainerClosed(EntityPlayer playerIn) {
			super.onContainerClosed(playerIn);
		}
	}

	public static class GuiWindow extends GuiContainer {

		World world;
		int x, y, z;
		EntityPlayer entity;
		GuiTextField Number;

		public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
			super(new GuiContainerMod(world, x, y, z, entity));
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.entity = entity;
			this.xSize = 125;
			this.ySize = 175;
		}

		private static final ResourceLocation texture = new ResourceLocation("mphones:textures/phoneapp.png");

		@Override
		public void drawScreen(int mouseX, int mouseY, float partialTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
			zLevel = 100.0F;
		}

		@Override
		protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
			try {
				super.mouseClicked(mouseX, mouseY, mouseButton);
				Number.mouseClicked(mouseX - guiLeft, mouseY - guiTop, mouseButton);
			} catch (Exception ignored) {
			}
		}

		@Override
		public void updateScreen() {
			super.updateScreen();
			Number.updateCursorCounter();
		}

		@Override
		protected void keyTyped(char typedChar, int keyCode) {
			try {
				super.keyTyped(typedChar, keyCode);
				Number.textboxKeyTyped(typedChar, keyCode);
			} catch (Exception ignored) {
			}
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int par1, int par2) {
			this.fontRenderer.drawString("Phone App", 36, 6, -16777216);
			Number.drawTextBox();
		}

		@Override
		public void onGuiClosed() {
			super.onGuiClosed();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void initGui() {
			super.initGui();
			this.guiLeft = (this.width - 125) / 2;
			this.guiTop = (this.height - 175) / 2;
			Keyboard.enableRepeatEvents(true);
			this.buttonList.clear();
			Number = new GuiTextField(0, this.fontRenderer, 3, 34, 120, 20);
			guiinventory.put("text:Number", Number);
			Number.setMaxStringLength(32767);
			Number.setText("+0");
			this.buttonList.add(new GuiButton(0, this.guiLeft + 55, this.guiTop + 143, 12, 20, "0"));
			this.buttonList.add(new GuiButton(1, this.guiLeft + 71, this.guiTop + 143, 48, 20, "CALL"));
			this.buttonList.add(new GuiButton(2, this.guiLeft + 37, this.guiTop + 143, 12, 20, "+"));
			this.buttonList.add(new GuiButton(3, this.guiLeft + 71, this.guiTop + 119, 12, 20, "9"));
			this.buttonList.add(new GuiButton(4, this.guiLeft + 55, this.guiTop + 119, 12, 20, "8"));
			this.buttonList.add(new GuiButton(5, this.guiLeft + 37, this.guiTop + 119, 12, 20, "7"));
			this.buttonList.add(new GuiButton(6, this.guiLeft + 71, this.guiTop + 95, 12, 20, "6"));
			this.buttonList.add(new GuiButton(7, this.guiLeft + 55, this.guiTop + 95, 12, 20, "5"));
			this.buttonList.add(new GuiButton(8, this.guiLeft + 37, this.guiTop + 95, 12, 20, "4"));
			this.buttonList.add(new GuiButton(9, this.guiLeft + 71, this.guiTop + 69, 12, 20, "3"));
			this.buttonList.add(new GuiButton(10, this.guiLeft + 55, this.guiTop + 69, 12, 20, "2"));
			this.buttonList.add(new GuiButton(11, this.guiLeft + 37, this.guiTop + 69, 12, 20, "1"));
		}

		@Override
		protected void actionPerformed(GuiButton button) {
			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
			World world = server.getWorld(entity.dimension);
			if (button.id == 0) {
			}
			if (button.id == 1) {
			}
			if (button.id == 2) {
			}
			if (button.id == 3) {
			}
			if (button.id == 4) {
			}
			if (button.id == 5) {
			}
			if (button.id == 6) {
			}
			if (button.id == 7) {
			}
			if (button.id == 8) {
			}
			if (button.id == 9) {
			}
			if (button.id == 10) {
			}
			if (button.id == 11) {
			}
		}

		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
	}
}
