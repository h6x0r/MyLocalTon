package org.ton.settings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.ton.wallet.WalletAddress;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Node5 implements Serializable, Node {

    private static final long serialVersionUID = 1L;

    String nodeName = "node5";
    String publicIp = "127.0.0.5";
    Integer consolePort = 4453;
    Integer publicPort = 4454;
    Integer liteServerPort = 4455;
    Integer outPort = 3276;
    Integer dhtPort = 3306;
    Integer dhtForkedPort = 3386;
    Integer dhtOutPort = 3276;
    Integer dhtForkedOutPort = 3286;
    transient String status = "not ready";

    String validatorMonitoringPubKeyHex;
    String validatorMonitoringPubKeyInteger;
    String validatorPrvKeyHex;
    String validatorPrvKeyBase64;
    String validatorPubKeyHex;
    String validatorPubKeyBase64;
    String validatorAdnlAddrHex;

    String validationSigningKey;
    String validationSigningPubKey;

    String validationAndlKey;
    String validationPubKeyHex;
    String validationPubKeyInteger;
    String prevValidationAndlKey;
    String prevValidationPubKeyHex;
    String prevValidationPubKeyInteger;
    
    Boolean validationPubKeyAndAdnlCreated = Boolean.FALSE;
    Boolean electionRequestSent = Boolean.FALSE;
    BigDecimal electionsRipped = BigDecimal.ZERO;
    BigDecimal totalRewardsCollected = BigDecimal.ZERO;
    BigDecimal lastRewardCollected = BigDecimal.ZERO;
    BigDecimal totalPureRewardsCollected = BigDecimal.ZERO;
    BigDecimal lastPureRewardCollected = BigDecimal.ZERO;
    BigDecimal avgPureRewardCollected = BigDecimal.ZERO;

    WalletAddress walletAddress;
    transient Process nodeProcess;
    transient Process dhtServerProcess;
    transient Process blockchainExplorerProcess;
    String nodeGlobalConfigLocation = getTonDbDir() + "my-ton-global.config.json";
    String nodeLocalConfigLocation = getTonDbDir() + "my-ton-local.config.json";
    String nodeForkedGlobalConfigLocation = getTonDbDir() + "my-ton-forked.config.json";
}
