{ pkgs }: {
    deps = [
        pkgs.azure-functions-core-tools
        pkgs.azure-functions-core-tools
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}