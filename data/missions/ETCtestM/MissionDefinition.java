package data.missions.ETCtestM;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.combat.ShipHullSpecAPI;
import com.fs.starfarer.api.combat.ShipVariantAPI;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissionDefinition implements MissionDefinitionPlugin {
    public void defineMission(MissionDefinitionAPI api) {
        api.initFleet(FleetSide.PLAYER, "ECS", FleetGoal.ATTACK, false);
        api.initFleet(FleetSide.ENEMY, "", FleetGoal.ESCAPE, true);
        
        api.setFleetTagline(FleetSide.PLAYER, "模拟舰船");
        api.setFleetTagline(FleetSide.ENEMY, "模拟敌人");
        
        api.addBriefingItem("没有什么要求");
        
        int num = 0;
        List<String> hulls = new ArrayList();
        for (String id : Global.getSettings().getAllVariantIds()) {
            if (id == null || !id.startsWith("ETC_")) continue;
            ShipVariantAPI variant = Global.getSettings().getVariant(id);
            ShipHullSpecAPI hull = variant.getHullSpec();
            if (!hull.getTags().contains("ETC_hide_in_test") && (variant.getUnusedOP(null) != hull.getOrdnancePoints(null))) {
                hulls.add(id);
            }
        }
        Collections.sort(hulls);
        for (String hull : hulls) {
			num++;
            api.addToFleet(FleetSide.PLAYER, hull, FleetMemberType.SHIP, "PLAYER " + num, false);
        }
        
        api.addToFleet(FleetSide.ENEMY, "paragon_Elite", FleetMemberType.SHIP, "ENEMY 1", true);
        api.addToFleet(FleetSide.ENEMY, "onslaught_xiv_Elite", FleetMemberType.SHIP, "ENEMY 2", false);
        api.addToFleet(FleetSide.ENEMY, "onslaught_xiv_Elite", FleetMemberType.SHIP, "ENEMY 3", false);
        api.addToFleet(FleetSide.ENEMY, "aurora_Assault", FleetMemberType.SHIP, "ENEMY 4", false);
        api.addToFleet(FleetSide.ENEMY, "aurora_Strike", FleetMemberType.SHIP, "ENEMY 5", false);
        api.addToFleet(FleetSide.ENEMY, "eagle_xiv_Elite", FleetMemberType.SHIP, "ENEMY 6", false);
        api.addToFleet(FleetSide.ENEMY, "eagle_xiv_Elite", FleetMemberType.SHIP, "ENEMY 7", false);
        api.addToFleet(FleetSide.ENEMY, "eagle_xiv_Elite", FleetMemberType.SHIP, "ENEMY 8", false);
        api.addToFleet(FleetSide.ENEMY, "wolf_PD", FleetMemberType.SHIP, "ENEMY 9", false);
        api.addToFleet(FleetSide.ENEMY, "wolf_Strike", FleetMemberType.SHIP, "ENEMY 10", false);
        api.addToFleet(FleetSide.ENEMY, "wolf_Strike", FleetMemberType.SHIP, "ENEMY 11", false);
        api.addToFleet(FleetSide.ENEMY, "atlas_Standard", FleetMemberType.SHIP, "ENEMY 12", false);
        api.addToFleet(FleetSide.ENEMY, "prometheus_Super", FleetMemberType.SHIP, "ENEMY 13", false);
        api.addToFleet(FleetSide.ENEMY, "prometheus_Super", FleetMemberType.SHIP, "ENEMY 14", false);
        api.addToFleet(FleetSide.ENEMY, "valkyrie_Elite", FleetMemberType.SHIP, "ENEMY 15", false);
        
        float width = 15000f;
        float height = 15000f;
        api.initMap(width / -2f, width / 2f, height / -2f, height / 2f);
        api.addAsteroidField(0f, 0f, 100, 7500f, 80f, 80f, 25);
    }
}