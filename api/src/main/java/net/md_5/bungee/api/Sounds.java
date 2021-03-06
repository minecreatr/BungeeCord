package net.md_5.bungee.api;

/**
 * Enum for all the Minecraft sounds.
 */
public enum Sounds {

    AMBIENCE_CAVE("ambient.cave"),
    AMBIENCE_RAIN("ambient.weather.rain"),
    AMBIENCE_THUNDER("ambient.weather.thunder"),
    ANVIL_BREAK("random.anvil_break"),
    ANVIL_LAND("random.anvil_land"),
    ANVIL_USE("random.anvil_use"),
    ARROW_HIT("random.bowhit"),
    BURP("random.burp"),
    CHEST_CLOSE("random.chestclose"),
    CHEST_OPEN("random.chestopen"),
    CLICK("random.click"),
    DOOR_CLOSE("random.door_close"),
    DOOR_OPEN("random.door_open"),
    DRINK("random.drink"),
    EAT("random.eat"),
    EXPLODE("random.explode"),
    FALL_BIG("damage.fallbig"),
    FALL_SMALL("damage.fallsmall"),
    FIRE("fire.fire"),
    FIRE_IGNITE("fire.ignite"),
    FIZZ("random.fizz"),
    FUSE("random.fuse"),
    GLASS("random.glass"),
    ITEM_BREAK("random.break"),
    ITEM_PICKUP("random.pop"),
    LAVA("liquid.lava"),
    LAVA_POP("liquid.lavapop"),
    LEVEL_UP("random.levelup"),
    MINECART_BASE("minecart.base"),
    MINECART_INSIDE("minecart.inside"),
    NOTE_BASS("note.bass"),
    NOTE_BASS_DRUM("note.bassattack"),
    NOTE_STICKS("note.bd"),
    NOTE_BASS_GUITAR("note.harp"),
    NOTE_SNARE_DRUM("note.snare"),
    NOTE_PLING("note.pling"),
    ORB_PICKUP("random.orb"),
    PISTON_EXTEND("tile.piston.out"),
    PISTON_RETRACT("tile.piston.in"),
    PORTAL("portal.portal"),
    PORTAL_TRAVEL("portal.travel"),
    PORTAL_TRIGGER("portal.trigger"),
    SHOOT_ARROW("random.bow"),
    SPLASH("liquid.splash1"),
    SPLASH2("liquid.splash2"),
    STEP_GRASS("step.grass"),
    STEP_GRAVEL("step.gravel"),
    STEP_LADDER("step.ladder"),
    STEP_SAND("step.sand"),
    STEP_SNOW("step.snow"),
    STEP_STONE("step.stone"),
    STEP_WOOD("step.wood"),
    STEP_WOOL("step.cloth"),
    SWIM("liquid.swim"),
    WATER("liquid.water"),
    WOOD_CLICK("random.wood_click"),
    BAT_DEATH("mob.bat.death"),
    BAT_HURT("mob.bat.hurt"),
    BAT_IDLE("mob.bat.idle"),
    BAT_LOOP("mob.bat.loop"),
    BAT_TAKEOFF("mob.bat.takeoff"),
    BLAZE_BREATH("mob.blaze.breathe"),
    BLAZE_DEATH("mob.blaze.death"),
    BLAZE_HIT("mod.blaze.hit"),
    CAT_HISS("mob.cat.hiss"),
    CAT_HIT("mob.cat.hit"),
    CAT_MEOW("mob.cat.meow"),
    CAT_PURR("mob.cat.purr"),
    CAT_PURREOW("mob.cat.purreow"),
    CHICKEN_IDE("mob.chicken.say"),
    CHICKEN_HURT("mob.chicken.hurt"),
    CHICKEN_EGG_POP("mob.chicken.plop"),
    CHICKEN_WALK("mob.chicken.step"),
    COW_IDLE("mob.cow.say"),
    COW_HURT("mob.cow.hurt"),
    COW_WALK("mob.cow.step"),
    CREEPER_HISS("mob.creeper.say"),
    CREEPER_DEATH("mob.creeper.death"),
    ENDERDRAGON_DEATH("mob.enderdragon.end"),
    ENDERDRAGON_GROWL("mob.enderdragon.growl"),
    ENDERDRAGON_HIT("mob.enderdragon.hit"),
    ENDERDRAGON_WINGS("mob.enderdragon.wings"),
    ENDERMAN_DEATH("mob.endermen.death"),
    ENDERMAN_HIT("mob.endermen.hit"),
    ENDERMAN_IDLE("mob.endermen.idle"),
    ENDERMAN_TELEPORT("mob.endermen.portal"),
    ENDERMAN_SCREAM("mob.endermen.scream"),
    ENDERMAN_STARE("mob.endermen.stare"),
    GHAST_SCREAM("mob.ghast.scream"),
    GHAST_SCREAM2("mob.ghast.affectionate_scream"),
    GHAST_CHARGE("mob.ghast.charge"),
    GHAST_DEATH("mob.ghast.death"),
    GHAST_FIREBALL("mob.ghast.fireball"),
    GHAST_MOAN("mob.ghast.moan"),
    IRONGOLEM_DEATH("mob.irongolem.death"),
    IRONGOLEM_HIT("mob.irongolem.hit"),
    IRONGOLEM_THROW("mob.irongolem.throw"),
    IRONGOLEM_WALK("mob.irongolem.walk"),
    MAGMACUBE_WALK("mob.magmacube.big"),
    MAGMACUBE_WALK2("mob.magmacube.small"),
    MAGMACUBE_JUMP("mob.magmacube.jump"),
    PIG_IDLE("mob.pig.say"),
    PIG_DEATH("mob.pig.death"),
    PIG_WALK("mob.pig.step"),
    SHEEP_IDLE("mob.sheep.say"),
    SHEEP_SHEAR("mob.sheep.shear"),
    SHEEP_WALK("mob.sheep.step"),
    SILVERFISH_HIT("mob.silverfish.hit"),
    SILVERFISH_KILL("mob.silverfish.kill"),
    SILVERFISH_IDLE("mob.silverfish.say"),
    SILVERFISH_WALK("mob.silverfish.step"),
    SKELETON_IDLE("mob.skeleton.say"),
    SKELETON_DEATH("mob.skeleton.death"),
    SKELETON_HURT("mob.skeleton.hurt"),
    SKELETON_WALK("mob.skeleton.walk"),
    SLIME_ATTACK("mob.slime.attack"),
    SLIME_WALK("mob.slime.big"),
    SLIME_WALK2("mob.slime.small"),
    SPIDER_IDLE("mob.spider.say"),
    SPIDER_DEATH("mob.spider.death"),
    SPIDER_WALK("mob.spider.step"),
    WITHER_DEATH("mob.wither.death"),
    WITHER_HURT("mob.wither.hurt"),
    WITHER_IDLE("mob.wither.idle"),
    WITHER_SHOOT("mob.wither.shoot"),
    WITHER_SPAWN("mob.wither.spawn"),
    WOLF_BARK("mob.wolf.bark"),
    WOLF_DEATH("mob.wolf.death"),
    WOLF_GROWL("mob.wolf.growl"),
    WOLF_HOWL("mob.wolf.howl"),
    WOLF_HURT("mob.wolf.hurt"),
    WOLF_PANT("mob.wolf.panting"),
    WOLF_SHAKE("mob.wolf.shake"),
    WOLF_WALK("mob.wolf.step"),
    WOLF_WHINE("mob.wolf.whine"),
    ZOMBIE_METAL("mob.zombie.metal"),
    ZOMBIE_WOOD("mob.zombie.wood"),
    ZOMBIE_WOODBREAK("mob.zombie.woodbreak"),
    ZOMBIE_IDLE("mob.zombie.say"),
    ZOMBIE_DEATH("mob.zombie.death"),
    ZOMBIE_HURT("mob.zombie.hurt"),
    ZOMBIE_INFECT("mob.zombie.infect"),
    ZOMBIE_UNFECT("mob.zombie.unfect"),
    ZOMBIE_REMEDY("mob.zombie.remedy"),
    ZOMBIE_WALK("mob.zombie.step"),
    ZOMBIE_PIG_IDLE("mob.zombiepig.zpig"),
    ZOMBIE_PIG_ANGRY("mob.zombiepig.zpigangry"),
    ZOMBIE_PIG_DEATH("mob.zombiepig.zpigdeath"),
    ZOMBIE_PIG_HURT("mob.zombiepig.zpighurt"),
    DIG_WOOL("dig.cloth"),
    DIG_GRASS("dig.grass"),
    DIG_GRAVEL("dig.gravel"),
    DIG_SAND("dig.sand"),
    DIG_SNOW("dig.snow"),
    DIG_STONE("dig.stone"),
    DIG_WOOD("dig.wood"),
    FIREWORK_BLAST("fireworks.blast"),
    FIREWORK_BLAST2("fireworks.blast_far"),
    FIREWORK_LARGE_BLAST("fireworks.largeBlast"),
    FIREWORK_LARGE_BLAST2("fireworks.largeBlast_far"),
    FIREWORK_TWINKLE("fireworks.twinkle"),
    FIREWORK_TWINKLE2("fireworks.twinkle_far"),
    FIREWORK_LAUNCH("fireworks.launch1"),
    SUCCESSFUL_HIT(" random.successful_hit"),
    HORSE_ANGRY("mob.horse.angry"),
    HORSE_ARMOR("mob.horse.armor"),
    HORSE_BREATHE("mob.horse.breathe"),
    HORSE_DEATH("mob.horse.death"),
    HORSE_GALLOP("mob.horse.gallop"),
    HORSE_HIT("mob.horse.hit"),
    HORSE_IDLE("mob.horse.idle"),
    HORSE_JUMP("mob.horse.jump"),
    HORSE_LAND("mob.horse.land"),
    HORSE_SADDLE("mob.horse.armor"),
    HORSE_SOFT("mob.horse.soft"),
    HORSE_WOOD("mob.horse.wood"),
    DONKEY_ANGRY("mob.horse.donkey.angry"),
    DONKEY_DEATH("mob.horse.donkey.death"),
    DONKEY_HIT("mob.horse.donkey.hit"),
    DONKEY_IDLE("mob.horse.donkey.idle"),
    HORSE_SKELETON_DEATH("mob.horse.skeleton.death"),
    HORSE_SKELETON_HIT("mob.horse.skeleton.hit"),
    HORSE_SKELETON_IDLE("mob.horse.skeleton.idle"),
    HORSE_ZOMBIE_DEATH("mob.horse.zombie.death"),
    HORSE_ZOMBIE_HIT("mob.horse.zombie.hit"),
    HORSE_ZOMBIE_IDLE("mob.horse.zombie.idle"),
    VILLAGER_DEATH("mob.villager.death"),
    VILLAGER_HAGGLE("mob.villager.haggle"),
    VILLAGER_HIT("mob.villager.hit"),
    VILLAGER_IDLE("mob.villager.idle"),
    VILLAGER_NO("mob.villager.no"),
    VILLAGER_YES("mob.villager.yes");

    private String name;

    Sounds(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return getName();
    }
}
