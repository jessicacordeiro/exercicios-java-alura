
/* Contrato Autentic�vel
 * Quem assina esse contrato precisa implementar
 * - M�TODO setSenha
 * - M�TODO autentica
 */
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
