package me.cortex.jarscanner;

import picocli.CommandLine;

/**
 * Main entry point for the CLI
 *
 * @see RootScanCommand CLI command outline.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        // Delegate app args to picocli, which will populate the root-scanner parameters and options
        int exitCode = new CommandLine(new RootScanCommand()).execute(args);
        System.exit(exitCode);
    }
}
