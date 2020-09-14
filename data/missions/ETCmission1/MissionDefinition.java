package data.missions.ETCmission1;

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
		
		api.setFleetTagline(FleetSide.PLAYER, "Douglas{Zantos}和他驾驶的新式战舰");
		api.setFleetTagline(FleetSide.ENEMY, "老古董船们与干扰因素");
		
		api.addBriefingItem("不要让这艘搭载着重要设备的舰船被击沉");
		api.addBriefingItem("尽量试用舰船上所有可用的常规攻击手段并摧毁所有敌舰");
		
		api.addToFleet(FleetSide.PLAYER, "ETC_ionization_Standard", FleetMemberType.SHIP, "ECS Jidai", true);
		
		api.defeatOnShipLoss("ECS Jidai");
		
		api.addToFleet(FleetSide.ENEMY, "berserker_Assault", FleetMemberType.SHIP, "Sample A", true);
		api.addToFleet(FleetSide.ENEMY, "bastillon_Standard", FleetMemberType.SHIP, "Sample B", false);
		api.addToFleet(FleetSide.ENEMY, "defender_PD", FleetMemberType.SHIP, "Sample C", false);
		api.addToFleet(FleetSide.ENEMY, "condor_Strike", FleetMemberType.SHIP, "Bomb Game", false);
		
		float width = 9000.0f;
		float height = 12000.0f;
		api.initMap((float)-width / 2.0f, (float)width / 2.0f, (float)-height / 2.0f, (float)height / 2.0f);
		api.addAsteroidField(0.0f, 0.0f, 30.0f, 9000.0f, 30.0f, 60.0f, 150);
		api.addPlanet(0.0f, 500.0f, 20.0f, "star_white", 1.0f, true);
	}
}