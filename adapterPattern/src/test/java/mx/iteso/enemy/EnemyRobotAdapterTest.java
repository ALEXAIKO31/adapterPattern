package mx.iteso.enemy;

import mx.iteso.adapter.enemy.EnemyAttacker;
import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

/**
 * Created by ALEX on 04/11/2015.
 */
public class EnemyRobotAdapterTest {

    EnemyRobot enemyRobot;
    EnemyAttacker enemyAttacker;

    @Test
    public void testEnemyRobotAdapter(){
        enemyRobot= mock(EnemyRobot.class);
        enemyAttacker = new EnemyRobotAdapter(enemyRobot);
        enemyAttacker.assignDriver("HumanName");
        enemyAttacker.driveForward();
        enemyAttacker.fireWeapon();
        verify(enemyRobot,times(1)).reactToHuman("HumanName");
        verify(enemyRobot,times(1)).smashWithHands();
        verify(enemyRobot,times(1)).walkForward();
    }
}
