package data.missions.ETCmission2;

import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin 
{
	public void defineMission(MissionDefinitionAPI api) 
	{
		api.initFleet(FleetSide.PLAYER, "ECS", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ATTACK, true);
		
		api.setFleetTagline(FleetSide.PLAYER, "Haru{Datus}与他的快速反应部队");
		api.setFleetTagline(FleetSide.ENEMY, "路德左径{忠诚舰队");
		
		api.addBriefingItem("击溃敌方舰队");
		
		api.addToFleet(FleetSide.PLAYER, "ETC_mechanical_energy_Standard", FleetMemberType.SHIP, "ECS Tsuyu", true);
		api.addToFleet(FleetSide.PLAYER, "ETC_mechanical_energy_Standard", FleetMemberType.SHIP, "ECS Kelos", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_kinetic_energy_Standard", FleetMemberType.SHIP, "ECS Meteor", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_kinetic_energy_Standard", FleetMemberType.SHIP, "ECS Nova", false);
		
		api.addToFleet(FleetSide.ENEMY, "hammerhead_Balanced", FleetMemberType.SHIP, "Hammer of Ludd", true);
		api.addToFleet(FleetSide.ENEMY, "mule_d_Standard", FleetMemberType.SHIP, "Keter", false);
		api.addToFleet(FleetSide.ENEMY, "brawler_pather_Raider", FleetMemberType.SHIP, "Hloy", false);
		api.addToFleet(FleetSide.ENEMY, "hound_luddic_path_Attack", FleetMemberType.SHIP, "Hafaza", false);
		api.addToFleet(FleetSide.ENEMY, "hound_Standard", FleetMemberType.SHIP, "Sacrifice", false);
		
		float width = 15000.0f;
		float height = 20000.0f;
		api.initMap((float)-width / 2.0f, (float)width / 2.0f, (float)-height / 2.0f, (float)height / 2.0f);
		api.addObjective(3000.0f, 0.0f, "nav_buoy");
        api.addObjective(-3000.0f, 0.0f, "nav_buoy");
		api.addAsteroidField(0.0f, 0.0f, 0.0f, 10000.0f, 10.0f, 20.0f, 30);
	}
}