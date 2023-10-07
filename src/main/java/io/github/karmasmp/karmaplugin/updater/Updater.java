package io.github.karmasmp.karmaplugin.updater;

import io.github.karmasmp.karmaplugin.KarmaPlugin;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class Updater {
    private final Logger logger = KarmaPlugin.logger();
    private final GitHub github;
    private final static String GITHUB_REPO = "KarmaSMP/KarmaSMP-Plugin";

    /**
     * Plugin updater
     * @param githubToken personal access token
     */
    public Updater(String githubToken) throws IOException {
        github = new GitHubBuilder().withOAuthToken(githubToken).build();
    }

    /**
     * Checks if there is an update available.
     * @return True if available, false if there is no update or the check failed.
     */
    public boolean checkForUpdate() {
        boolean isUpdateAvailable = false;
        String pluginVersion = KarmaPlugin.getVersion();

        try {
            github.getRepository(GITHUB_REPO).getLatestRelease().getTargetCommitish()
        } catch (IOException e) {
            logger.warning("Updater failed to check for updates.");
            throw new RuntimeException(e);
        }

        return isUpdateAvailable;
    }
}
