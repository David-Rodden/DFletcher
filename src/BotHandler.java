import gui.DFletcherGUI;
import micro_handler.FletchingHandler;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.methods.skills.SkillTracker;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

import java.awt.*;

@ScriptManifest(author = "Dungeonqueer", version = 1.09, name = "DFletcher", category = Category.FLETCHING)
public class BotHandler extends AbstractScript {
    private FletchingHandler fletchingHandler;
    private SkillTracker tracker;

    /**
     * The initialization of objects is done here
     */
    @Override
    public void onStart() {
        new DFletcherGUI();
        tracker = getSkillTracker();
        tracker.start(Skill.FLETCHING);
        fletchingHandler = new FletchingHandler(this);
        super.onStart();
    }

    /**
     * Runs the handler, following its logic
     *
     * @return
     */
    @Override
    public int onLoop() {
        return fletchingHandler.verify();
    }

    @Override
    public void onPaint(final Graphics graphics) {
        graphics.setColor(Color.CYAN);
        graphics.drawString("DFletcher", 20, 20);
        graphics.drawString("Current task: " + fletchingHandler.getTaskDescription(), 20, 40);
        graphics.setColor(Color.RED);
        reliefefy("Level: " + getSkills().getRealLevel(Skill.FLETCHING), graphics, 20, 60);
        reliefefy("Xp/hr: " + tracker.getGainedExperiencePerHour(Skill.FLETCHING), graphics, 20, 80);
        super.onPaint(graphics);
    }

    public void reliefefy(final String s, final Graphics graphics, final int x, final int y) {
        graphics.setColor(Color.WHITE);
        graphics.drawString(s, x, y + 1);
        graphics.setColor(Color.RED);
        graphics.drawString(s, x, y);
    }
}
