public class Main {
   @EventHandler
    public void onRightClickAnything(PlayerInteractEvent event) {
       System.out.println("Is the event null? " + event);

        try {
            if(event.getClickedBlock() != null) {
                if(event.getClickedBlock().getType() == CompMaterial.GRASS_BLOCK.getMaterial()) {
                    handleClickingGrass(event.getClickedBlock(), event.getPlayer());
                }
            }
        } catch (NullPointerException ex) {
            System.out.println("This is not a grass block");
        }


       System.out.println("...finished!");
   }

}
