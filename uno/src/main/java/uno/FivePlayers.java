package uno;

public enum FivePlayers implements Player{
	ZERO {
		@Override
		public FivePlayers clockWise() {
			return null;
			
		}

		@Override
		public FivePlayers counterClockWise() {
			return null;
			
		}
	},
	ONE {
		@Override
		public FivePlayers clockWise() {
			return null;
			
		}

		@Override
		public FivePlayers counterClockWise() {
			return null;
			
		}
	},
	TWO {
		@Override
		public FivePlayers clockWise() {
			return null;
			
		}

		@Override
		public FivePlayers counterClockWise() {
			return null;
			
		}
	},
	THREE {
		@Override
		public FivePlayers clockWise() {
			return null;
			
		}

		@Override
		public FivePlayers counterClockWise() {
			return null;
			
		}
	},
	FOUR {
		@Override
		public FivePlayers clockWise() {
			return null;
			
		}

		@Override
		public FivePlayers counterClockWise() {
			return null;
			
		}
	};
	
	public abstract FivePlayers clockWise();
	public abstract FivePlayers counterClockWise();
}
