package de.karasuma.discordbot.lol.consolecommands;

import de.karasuma.discordbot.lol.DiscordBot;

public class ConsoleCommandStart implements ConsoleCommand {

	private DiscordBot bot;

	public ConsoleCommandStart(DiscordBot bot) {
		this.bot = bot;
	}

	@Override
	public String execute(String input) {	
		return bot.toString() + ": " + bot.startBot();
	}

	@Override
	public String getDescription() {
		return "Starts " + bot.toString();
	}

}
