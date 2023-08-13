package Model;

public class Authentication {

    private String ip;
    private String ipv6;
    private String vlan;
    private String mac;
    private String gateway;
    private String inicioSessao;
    private String finalSessao;

    public Authentication(String ip, String ipv6, String vlan, String mac, String gateway, String inicioSessao, String finalSessao) {
        this.ip = ip;
        this.ipv6 = ipv6;
        this.vlan = vlan;
        this.mac = mac;
        this.gateway = gateway;
        this.inicioSessao = inicioSessao;
        this.finalSessao = finalSessao;
    }

    public Authentication() {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public String getVlan() {
        return vlan;
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getInicioSessao() {
        return inicioSessao;
    }

    public void setInicioSessao(String inicioSessao) {
        this.inicioSessao = inicioSessao;
    }

    public String getFinalSessao() {
        return finalSessao;
    }

    public void setFinalSessao(String finalSessao) {
        this.finalSessao = finalSessao;
    }
}
