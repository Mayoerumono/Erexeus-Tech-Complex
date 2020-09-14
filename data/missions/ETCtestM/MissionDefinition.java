package data.missions.ETCtestM;

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
		api.initFleet(FleetSide.ENEMY, "", FleetGoal.ESCAPE, true);
		
		api.setFleetTagline(FleetSide.PLAYER, "模拟舰船");
		api.setFleetTagline(FleetSide.ENEMY, "模拟敌人");
		
		api.addBriefingItem("没有什么要求");
		
		api.addToFleet(FleetSide.PLAYER, "ETC_helium_Elite", FleetMemberType.SHIP, "Player1", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_point_discharge_Standard", FleetMemberType.SHIP, "Player2", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_transition_Standard", FleetMemberType.SHIP, "Player3", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_andras_Elite", FleetMemberType.SHIP, "Player4", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_paradox_scholar_Standard", FleetMemberType.SHIP, "Player5", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_potential_energy_Standard", FleetMemberType.SHIP, "Player6", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_ionization_Standard", FleetMemberType.SHIP, "Player7", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_mechanical_energy_Standard", FleetMemberType.SHIP, "Player8", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_leraje_Standard", FleetMemberType.SHIP, "Player9", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_shax_Standard", FleetMemberType.SHIP, "Player10", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_ground_state_Standard", FleetMemberType.SHIP, "Player11", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_hyperbola_Standard", FleetMemberType.SHIP, "Player12", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_kinetic_energy_Standard", FleetMemberType.SHIP, "Player13", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_kinetic_energy_s_Standard", FleetMemberType.SHIP, "Player14", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_useful_work_Standard", FleetMemberType.SHIP, "Player15", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_detector_Standard", FleetMemberType.SHIP, "Player16", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_freighter_1_Standard", FleetMemberType.SHIP, "Player17", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_tanker_1_Standard", FleetMemberType.SHIP, "Player18", false);
		api.addToFleet(FleetSide.PLAYER, "ETC_degenerate_Standard", FleetMemberType.SHIP, "Player19", false);
		
		api.addToFleet(FleetSide.ENEMY, "paragon_Elite", FleetMemberType.SHIP, "Enemy1", true);
		api.addToFleet(FleetSide.ENEMY, "onslaught_xiv_Elite", FleetMemberType.SHIP, "Enemy2", false);
		api.addToFleet(FleetSide.ENEMY, "onslaught_xiv_Elite", FleetMemberType.SHIP, "Enemy3", false);
		api.addToFleet(FleetSide.ENEMY, "aurora_Assault", FleetMemberType.SHIP, "Enemy4", false);
		api.addToFleet(FleetSide.ENEMY, "aurora_Strike", FleetMemberType.SHIP, "Enemy5", false);
		api.addToFleet(FleetSide.ENEMY, "eagle_xiv_Elite", FleetMemberType.SHIP, "Enemy6", false);
		api.addToFleet(FleetSide.ENEMY, "eagle_xiv_Elite", FleetMemberType.SHIP, "Enemy7", false);
		api.addToFleet(FleetSide.ENEMY, "eagle_xiv_Elite", FleetMemberType.SHIP, "Enemy8", false);
		api.addToFleet(FleetSide.ENEMY, "wolf_PD", FleetMemberType.SHIP, "Enemy9", false);
		api.addToFleet(FleetSide.ENEMY, "wolf_Strike", FleetMemberType.SHIP, "Enemy10", false);
		api.addToFleet(FleetSide.ENEMY, "wolf_Strike", FleetMemberType.SHIP, "Enemy11", false);
		api.addToFleet(FleetSide.ENEMY, "atlas_Standard", FleetMemberType.SHIP, "Enemy12", false);
		api.addToFleet(FleetSide.ENEMY, "prometheus_Super", FleetMemberType.SHIP, "Enemy13", false);
		api.addToFleet(FleetSide.ENEMY, "prometheus_Super", FleetMemberType.SHIP, "Enemy14", false);
		api.addToFleet(FleetSide.ENEMY, "valkyrie_Elite", FleetMemberType.SHIP, "Enemy15", false);
		
		float none = 0f;
		float width = 15000f;
		float height = 15000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		float minX = -width/2;
		float minY = -height/2;
		api.addAsteroidField(none, none, 100, 7500f, 80f, 80f, 25);
	}
}