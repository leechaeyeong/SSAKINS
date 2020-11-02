package com.ssafy.ssakins.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class Project {
    private String name;
    private String giturl;
    private List<Plugin> plugins;
    private List<Credential> credentials;
    private List<Server> servers;
    private List<GlobalTool> globalTools;
    private List<Command> commands;


    public void changeName(String name){
        this.name=name;
    }

    public void changeGiturl(String giturl){
        this.giturl=giturl;
    }

    public void addPlugin(Plugin plugin){
        getPluginsInternal().add(plugin);
    }

    public void addCredential(Credential credential){
        getCredentialsInternal().add(credential);
    }

    public void addServer(Server server){
        getServersInternal().add(server);
    }

    public void addGlobalTool(GlobalTool globalTool){
        getGlobalToolsInternal().add(globalTool);
    }

    public void addCommand(Command command){
        getCommandsInternal().add(command);
    }



    private List<Plugin> getPluginsInternal(){
        if(this.plugins==null){
            this.plugins=new ArrayList<>();
        }
        return this.plugins;
    }
    private List<Credential> getCredentialsInternal(){
        if(this.credentials==null){
            this.credentials=new ArrayList<>();
        }
        return this.credentials;
    }
    private List<Server> getServersInternal(){
        if(this.servers==null){
            this.servers=new ArrayList<>();
        }
        return this.servers;
    }
    private List<GlobalTool> getGlobalToolsInternal(){
        if(this.globalTools==null){
            this.globalTools=new ArrayList<>();
        }
        return this.globalTools;
    }
    private List<Command> getCommandsInternal(){
        if(this.commands==null){
            this.commands=new ArrayList<>();
        }
        return this.commands;
    }


    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", giturl='" + giturl + '\'' +
                ", plugins=" + plugins +
                ", credentials=" + credentials +
                ", servers=" + servers +
                ", globalTools=" + globalTools +
                ", commands=" + commands +
                '}';
    }
}