package org.apollo.io.player;

import org.apollo.game.model.entity.Player;
import org.apollo.security.PlayerCredentials;

/**
 * A {@link PlayerSerializer} that utilises {@code JDBC} to communicate with an SQL database containing player data.
 * 
 * @author Major
 */
public final class JdbcPlayerSerializer implements PlayerSerializer {

	@Override
	public void savePlayer(Player player) throws Exception {
		throw new UnsupportedOperationException("JDBC saving is not supported at this time.");
	}

	@Override
	public PlayerLoaderResponse loadPlayer(PlayerCredentials credentials) throws Exception {
		throw new UnsupportedOperationException("JDBC loading is not supported at this time.");
	}

}