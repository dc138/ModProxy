package me.DarthChungo.ModProxy;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;

import org.slf4j.Logger;

import java.io.File;
import java.nio.file.Path;

@Plugin( //
    id = "modproxyvelocity", //
    name = "ModProxyVelocity", //
    version = BuildConstants.version, //
    description = "TODO: fill this", //
    authors = { "DarthChungo" } //
)
public class ModProxyVelocity {
  public final ProxyServer proxy_server;

  public Logger logger;
  public File datadir;

  @Inject
  public ModProxyVelocity(ProxyServer server, Logger log, @DataDirectory final Path folder) {
    proxy_server = server;
    logger = log;
    datadir = folder.toFile();

    if (!datadir.exists()) {
      datadir.mkdirs();
    }
  }

  @Subscribe
  public void onProxyInitialization(ProxyInitializeEvent event) {
  }
}
