package one.contentbox.boxd.protocol.core.request;

import one.contentbox.boxd.protocol.core.response.TokenTag;

public class TokenIssueTx {

    private long gasPrice;
    private String owner;
    private String issuer;
    private TokenTag token;

    public TokenIssueTx() {
    }

    public long getGasPrice() {
        return this.gasPrice;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public TokenTag getToken() {
        return this.token;
    }

    public void setGasPrice(long gasPrice) {
        this.gasPrice = gasPrice;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public void setToken(TokenTag token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TokenIssueTx)) return false;
        final TokenIssueTx other = (TokenIssueTx) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getGasPrice() != other.getGasPrice()) return false;
        final Object this$issuee = this.getOwner();
        final Object other$issuee = other.getOwner();
        if (this$issuee == null ? other$issuee != null : !this$issuee.equals(other$issuee)) return false;
        final Object this$issuer = this.getIssuer();
        final Object other$issuer = other.getIssuer();
        if (this$issuer == null ? other$issuer != null : !this$issuer.equals(other$issuer)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $fee = this.getGasPrice();
        result = result * PRIME + (int) ($fee >>> 32 ^ $fee);
        final Object $issuee = this.getOwner();
        result = result * PRIME + ($issuee == null ? 43 : $issuee.hashCode());
        final Object $issuer = this.getIssuer();
        result = result * PRIME + ($issuer == null ? 43 : $issuer.hashCode());
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TokenIssueTx;
    }

    public String toString() {
        return "TokenIssueTx(gasPrice=" + this.getGasPrice() + ", owner=" + this.getOwner() + ", issuer=" + this.getIssuer() + ", token=" + this.getToken() + ")";
    }
}
