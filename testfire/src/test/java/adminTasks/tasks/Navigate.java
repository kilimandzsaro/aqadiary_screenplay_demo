package adminTasks.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import adminTasks.models.Selection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate implements Task {
  
  private final Selection selection;
  
  public Navigate(Selection selection) { this.selection = selection;}

  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(selection.url()));
  }
  
  public static Navigate to(Selection selection) {
    return instrumented(Navigate.class, selection);
  }

}
