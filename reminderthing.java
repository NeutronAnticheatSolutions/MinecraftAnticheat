// I'm going to code a reach check when I get home, so I'm leaving this as a reminder of what to code (for the reach check).

public class ReachCheck extends Listener {
  @EventHandler // I forgot what the name of this was so I put this here
 public entityDamageByEntityEvent(EntityDamageByEntityEvent e) {
   if (e.getDamager instanceof Player && e.getEntity instanceof Player) { // check whether or not both the attacker and the attacked entity are players
    // rest of my code stuff here lol
   }
 }
}
